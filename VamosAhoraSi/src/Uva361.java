import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Uva361 {
	
	public static void main(String[] args) throws Throwable {
		StringBuilder sb = new StringBuilder();
		int cont = 1;
		Scanner sc = new Scanner(System.in);
		for(;true;){
			int C =sc.nextInt(), R = sc.nextInt(), O = sc.nextInt();
			if( C == 0 && R == 0 && O == 0 )break;
			Point2D[] ptC = new Point2D[C];
			for(int i=0;i<C;++i){
				
				ptC[i]=new Point2D.Double(sc.nextInt(),sc.nextInt());
			}
			
			Point2D[] casoP = convexHull(ptC, 1e-10, true);
			
			Point2D[] ptR = new Point2D[R];
			
			for(int i=0;i<R;++i){
				ptR[i]=new Point2D.Double(sc.nextInt(), sc.nextInt());
			}
			
			Point2D[] casoR =convexHull(ptR, 1e-10, true);
			
			sb.append("Data set "+(cont++)+":\n");
			
			for(int i=0;i<O;++i){
				Point2D punto = new Point2D.Double(sc.nextInt(), sc.nextInt());
				if(casoP.length > 2 && puntoDentroPoligono(casoP,punto, true, 1e-10)){
					sb.append("     Citizen at ("+(int)punto.getX()+","+(int)punto.getY()+") is safe.\n");
				}else if(casoR.length > 2  &&puntoDentroPoligono(casoR,punto, true, 1e-10))
					sb.append("     Citizen at ("+(int)punto.getX()+","+(int)punto.getY()+") is robbed.\n");
				else
					sb.append("     Citizen at ("+(int)punto.getX()+","+(int)punto.getY()+") is neither.\n");
			}
			sb.append("\n");
		}
		System.out.print(new String(sb.substring(0, sb.length())));
	}

	static boolean doubleEquals(double a, double b, double epsilon){
		if(Math.abs(a) == Double.POSITIVE_INFINITY && Math.abs(b) == Double.POSITIVE_INFINITY)return true;
		return Math.abs(a-b) <= epsilon;
	}
	static double dist(Point2D p, Point2D q) {
		return (p.getX() - q.getX()) * (p.getX() - q.getX()) + (p.getY() - q.getY()) * (p.getY() - q.getY());
	}
	static double movimientoVectorial(Point2D p, Point2D q, Point2D r){
		return (q.getX()-p.getX())*(r.getY()-p.getY()) - (q.getY()-p.getY())*(r.getX()-p.getX());
	}
	static Point2D[] convexHull(Point2D[] pts, final double epsilon, boolean conBorde){
		if(pts.length==0)return new Point2D[0];
		int n=pts.length;
		Point2D[] res=new Point2D[n];
		Point2D p=new Point2D.Double(Double.MAX_VALUE,Double.MAX_VALUE);
		for(Point2D q:pts)
			if(q.getY()<p.getY()||(doubleEquals(q.getY(),p.getY(),epsilon)&&q.getX()<p.getX()))p=q;
		final Point2D P=p;
		Arrays.sort(pts, new Comparator<Point2D>() {
			public int compare(Point2D o1, Point2D o2) {
				if(o1==P)return -1;if(o2==P)return 1;
				double dist1=Math.atan2(o1.getX()-P.getX(),o1.getY()-P.getY()),
				dist2=Math.atan2(o2.getX()-P.getX(),o2.getY()-P.getY());
				return doubleEquals(dist1,dist2,epsilon)?(dist(P,o1)<dist(P,o2)?1:-1):(dist1<dist2?-1:1);
			}
		});
		int j=Math.min(2, n);int i=j+1;
		res[0]=p;res[1%n]=pts[1%n];
		Point2D p1=pts[1%n],p2=pts[2%n];
		if(!conBorde){
			j = 1;
			for (int k = 1; k < n; k++)
				if(!pts[k].equals(pts[0])){
					p1 = pts[k]; res[1%n]=pts[k];
					p2 = pts[(k+1)%n];
					i=k;j=2;
					break;
				}
		}
		for (; i <= n; i++)
		if(doubleEquals(movimientoVectorial(p2,p1,pts[i%n]),0,epsilon)&&conBorde||(!doubleEquals(movimientoVectorial(p2, p1, pts[i%n]),0,epsilon)&&movimientoVectorial(p2,p1,pts[i%n])>0)){
			if(p2!=pts[1])res[j++]=p2;
	 			p1=p2;p2=pts[i%n];
		}
		else {
			if(i>2&&!doubleEquals(movimientoVectorial(p2,p1,pts[i%n]),0,epsilon))i--;
			if(j-2<0)p1=res[0];else p1 =res[j-2];p2 = res[j-1];
			if(j > 2){res[--j] = null;}
		}
		return Arrays.copyOfRange(res, 0, j);
	}

	static Shape getShape(Point2D[] pts){
		Path2D sh = new Path2D.Double(); 
		if(pts.length > 0){
			sh.moveTo(pts[0].getX(), pts[0].getY());
			for (int i = 1; i < pts.length; i++)sh.lineTo(pts[i].getX(), pts[i].getY());
			sh.closePath();
		}
		return sh;
	}
	static boolean puntoDentroPoligono(Point2D[] pts, Point2D pt, boolean conBorde, double epsilon){
		Path2D sh = new Path2D.Double(); 
		if(pts.length > 0){
			sh.moveTo(pts[0].getX(), pts[0].getY());
			for (int i = 1; i < pts.length; i++){
				if(new Line2D.Double(pts[i], pts[(i+1)%pts.length]).ptSegDist(pt) <= epsilon)return conBorde;
				sh.lineTo(pts[i].getX(), pts[i].getY());
			}
			sh.closePath();
		}
		return sh.contains(pt);
	}
}

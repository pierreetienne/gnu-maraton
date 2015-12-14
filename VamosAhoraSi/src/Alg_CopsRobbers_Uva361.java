import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Alg_CopsRobbers_Uva361 {


	public static void main(String[] args) throws Throwable {
		Scanner in = new Scanner( new InputStreamReader( System.in ) );
		int casos = 1;
		for(  ; ; casos++) {
			int cops = in.nextInt();
			int robb = in.nextInt();
			int citi = in.nextInt();
			if( cops == 0 && robb == 0 && citi == 0 ) return;

			double[][] ptsCops = new double[cops][2];
			double[][] ptsRobb = new double[robb][2];
			double[][] ptsCiti = new double[citi][2];


			for (int i = 0; i < ptsCops.length; i++) {
				ptsCops[i][0] = in.nextInt();
				ptsCops[i][1] = in.nextInt();
			}

			for (int i = 0; i < ptsRobb.length; i++) {
				ptsRobb[i][0] = in.nextInt();
				ptsRobb[i][1] = in.nextInt();
			}

			for (int i = 0; i < ptsCiti.length; i++) {
				ptsCiti[i][0] = in.nextInt();
				ptsCiti[i][1] = in.nextInt();
			}

			System.out.print("Data set "+casos+":\n");
			double[][] convexCops = convexHull(ptsCops, 0.9, false);
			double[][] convexRobbs = convexHull(ptsRobb, 0.9, false);

			for (double[] p : ptsCiti) {
				int a = (int)p[0];
				int b = (int)p[1];
				if (dentroPoligono(convexCops, p, true)) {
					System.out.println("     Citizen at ("+a+","+b+") is safe." );
				}else if(dentroPoligono(convexRobbs, p, true)){
					System.out.println("     Citizen at ("+a+","+b+") is robbed." );
				}else{
					System.out.println("     Citizen at ("+a+","+b+") is neither." );
				}
			}
			System.out.println();
		}
	}


	static double[][] convexHull(double[][] pts, final double epsilon, boolean conBorde){
		if(pts.length==0)return new double[0][];
		int n=pts.length;
		double[][] res=new double[n][2];
		double[] p=new double[]{Double.MAX_VALUE,Double.MAX_VALUE};
		for(double[] q:pts)
			if(q[1]<p[1]||(doubleEquals(q[1],p[1],epsilon)&&q[0]<p[0]))p=q;
		
		final double[] P=p;
		Arrays.sort(pts, new Comparator<double[]>() {
			public int compare(double[] o1, double[] o2) {
				if(o1==P)return -1;if(o2==P)return 1;
				double dist1=Math.atan2(o1[0]-P[0],o1[1]-P[1]),
						dist2=Math.atan2(o2[0]-P[0],o2[1]-P[1]);
				return doubleEquals(dist1,dist2,epsilon)?(dist(P,o1)<dist(P,o2)?1:-1):(dist1<dist2?-1:1);
			}
		});
		int j=Math.min(2, n);int i=j+1;
		res[0]=p;res[1%n]=pts[1%n];
		double[] p1=pts[1%n],p2=pts[2%n];
		if(!conBorde){
			j = 1;
			for (int k = 1; k < n; k++)
				if(!pts[k].equals(pts[0])){p1 = pts[k]; res[1%n]=pts[k];
				p2 = pts[(k+1)%n];i=k;j=2;break;}
		}
		for (; i <= n; i++)
			if((doubleEquals(movimientoVectorial(p2,p1,pts[i%n]),0,epsilon)&&conBorde)||(!doubleEquals(movimientoVectorial(p2, p1, pts[i%n]),0,epsilon)&&movimientoVectorial(p2,p1,pts[i%n])>0)){
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

	static double dist(double[] p, double[] q) {
        return (p[0]-q[0])*(p[0]-q[0])+(p[1]-q[1])*(p[1]-q[1]);
}
	
	static boolean doubleEquals(double a, double b, double epsilon){
		if(Math.abs(a)==Double.POSITIVE_INFINITY&&Math.abs(b)==Double.POSITIVE_INFINITY)return true;
		return Math.abs(a-b)<=epsilon;
	}

	static double movimientoVectorial(double[] p,double[] q,double[] r){
		return (q[0]-p[0])*(r[1]-p[1])-(q[1]-p[1])*(r[0]-p[0]);
	}

	static double ds(double[] a, double[] b) {return (b[0]-a[0])*(b[0]-a[0])+(b[1]-a[1])*(b[1]-a[1]);} 
	
	static double distPS(double[] p1, double[] p2, double[] p) { 
		  double dP=ds(p1,p2),d1=ds(p1,p),d2=ds(p2,p); 
		  return (d2+dP<d1||d1+dP<d2)?Math.sqrt(Math.min(d1,d2)):distPL(p1,p2,p); 
		}

	static double distPL(double[] p1, double[] p2, double[] p) { 
		  return Math.abs((p2[0]-p1[0])*(p1[1]-p[1])-(p2[1]-p1[1])*(p1[0]-p[0]))/Math.sqrt(ds(p1,p2)); 
	}
	static boolean dentroPoligono(double[][] pt, double[] p, boolean bd) { // bd: con borde? 
		  boolean b=false; 
		  for (int i=0,j=1,t=pt.length; i<t; i++,j=j+1==t?0:j+1) { 
		    if (distPS(pt[i],pt[j],p)<1e-11) return bd; 
		    if (((pt[j][1]<=p[1]&&p[1]<pt[i][1])||(pt[i][1]<=p[1]&&p[1]<pt[j][1])) && 
		       (p[0]-pt[j][0]<(p[1]-pt[j][1])*(pt[i][0]-pt[j][0])/(pt[i][1]-pt[j][1]))) b=!b; 
		  } 
		  return b; 
		} 
	
	
//	static Point2D[] convexHull(Point2D[] pts, final double epsilon, boolean conBorde){
//		if(pts.length==0)return new Point2D[0];
//		int n=pts.length;
//		Point2D[] res=new Point2D[n];
//		Point2D p=new Point2D.Double(Double.MAX_VALUE,Double.MAX_VALUE);
//		for(Point2D q:pts)
//			if(q.getY()<p.getY()||(doubleEquals(q.getY(),p.getY(),epsilon)&&q.getX()<p.getX()))p=q;
//		final Point2D P=p;
//		Arrays.sort(pts, new Comparator<Point2D>() {
//			public int compare(Point2D o1, Point2D o2) {
//				if(o1==P)return -1;if(o2==P)return 1;
//				double dist1=Math.atan2(o1.getX()-P.getX(),o1.getY()-P.getY()),
//						dist2=Math.atan2(o2.getX()-P.getX(),o2.getY()-P.getY());
//				return doubleEquals(dist1,dist2,epsilon)?(dist(P,o1)<dist(P,o2)?1:-1):(dist1<dist2?-1:1);
//			}
//		});
//		int j=Math.min(2, n);int i=j+1;
//		res[0]=p;res[1%n]=pts[1%n];
//		Point2D p1=pts[1%n],p2=pts[2%n];
//		if(!conBorde){
//			j = 1;
//			for (int k = 1; k < n; k++)
//				if(!pts[k].equals(pts[0])){p1 = pts[k]; res[1%n]=pts[k];
//				p2 = pts[(k+1)%n];i=k;j=2;break;}
//		}
//		for (; i <= n; i++)
//			if((doubleEquals(movimientoVectorial(p2,p1,pts[i%n]),0,epsilon)&&conBorde)||(!doubleEquals(movimientoVectorial(p2, p1, pts[i%n]),0,epsilon)&&movimientoVectorial(p2,p1,pts[i%n])>0)){
//				if(p2!=pts[1])res[j++]=p2;
//				p1=p2;p2=pts[i%n];
//			}
//			else {
//				if(i>2&&!doubleEquals(movimientoVectorial(p2,p1,pts[i%n]),0,epsilon))i--;
//				if(j-2<0)p1=res[0];else p1 =res[j-2];p2 = res[j-1];
//				if(j > 2){res[--j] = null;}
//			}
//		return Arrays.copyOfRange(res, 0, j);
//	}
//
//	static boolean doubleEquals(double a, double b, double epsilon){
//		if(Math.abs(a)==Double.POSITIVE_INFINITY&&Math.abs(b)==Double.POSITIVE_INFINITY)return true;
//		return Math.abs(a-b)<=epsilon;
//	}
//
//	static double movimientoVectorial(Point2D p,Point2D q,Point2D r){
//		return (q.getX()-p.getX())*(r.getY()-p.getY())-(q.getY()-p.getY())*(r.getX()-p.getX());
//	}
//
//	static double dist(Point2D p, Point2D q) {
//		return (p.getX()-q.getX())*(p.getX()-q.getX())+(p.getY()-q.getY())*(p.getY()-q.getY());
//	}
//
//	static boolean puntoDentroPoligono(Point2D[] pts,Point2D pt,boolean conBorde){
//		Path2D sh=new Path2D.Double();int n;
//		if((n=pts.length)==1)return pt.equals(pts[0])&&conBorde;
//		if(n>0){
//			sh.moveTo(pts[0].getX(),pts[0].getY());
//			for (int i=1;i<pts.length;i++){
//				if(new Line2D.Double(pts[i],pts[(i+1)%n]).ptSegDist(pt)<1e-10)return conBorde;
//				sh.lineTo(pts[i].getX(),pts[i].getY());
//			}
//			sh.closePath();
//		}
//		return sh.contains(pt);
//	}
}
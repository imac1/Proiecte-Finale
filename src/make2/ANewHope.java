package make2;

public class ANewHope {

	public static void main(String[] args) {
		
		
		int a,b,c,d;
		
		for (a=0; a<=999;a++){
			for (b=0;b<999;b++){
				for(c=0;c<=999;c++){
					for(d=0;d<=999;d++){
						int A = a+2;
						int B = b-2;
						int C = c*2;
						int D = d/2;
						int sum = a+b+c+d;
						if (A==B && B==C && C==D ){
							if (sum ==45){
								System.out.println(a+ "," + b+","+c+","+d + " -> " + sum);
							}
							
						}
						
					}
				}
				
			}
			
		}

	}

}

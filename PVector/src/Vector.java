
public class Vector {

	public static void main(String[] args) {
		
		int[] v = new int[]{7,8,9,10,5,2,12};
		System.out.println("v.length= " + v.length);
		System.out.println("");
//		System.out.println("Visitamos todos: ");
//		for(int i=0;i<v.length;i++){
//			v[i]= v[i]*2;
//			System.out.println(v[i]);
//		}
//		System.out.println("");
		System.out.println("v[0]= "+ v[0]);
		System.out.println("v[4]= "+ v[4]);
		System.out.println("");
		System.out.print("El minimo es: " +min(v));
		System.out.println();
		show(v);
		System.out.println();
		int index = indexOf(v,100);
		System.out.println("index: "+index);
	}
	public static int min(int[] v){
		int minimo = v[0];
		for(int i=0; i<v.length; i++){
			if(v[i] < minimo){
				minimo = v[i];
			}
		}
		return minimo;	
	}
	public static void show(int[] v){
		for(int i= 0; i< v.length; i++){
			System.out.println(v[i]);
		}
	}
	public static int indexOf(int[] v , int value){
//		int index =0;
//		while(index < v.length && v[index]!= value){
//		//while(v[index] != value && index < v.length) ArrayIndexOut
//			index++;
//			if( index == v.length){
//				return -1;
//			}
//		}
//		return index;
		
		for( int index=0; index <v.length; index++)
			if(v[index] == value)
				return index;
		return -1;	//si no se encuentra devolver -1
	}
	
}

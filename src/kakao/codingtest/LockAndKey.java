package kakao.codingtest;

public class LockAndKey {
	public static void main(String[] args) {
		int[][] key = new int[3][3];
		int[][] lock = new int[3][3];
		
		for(int i=0; i<key.length; ++i) {
			for(int j=0; j<key.length; ++j) {
				key[i][j] = 0;
				lock[i][j] = 1;
			}
		}
		key[1][0] = 1;
		key[2][1] = 1;
		key[2][2] = 1;
		lock[1][2] = 0;
		lock[2][1] = 0;
		
		
		System.out.println("------ key -------");
		for(int[] arr : key) {
			for(int i : arr) {
				System.out.print(i);
			}
			System.out.println();
		}
	
		System.out.println("------lock-------");
		for(int[] arr : lock) {
			for(int i : arr) {
				System.out.print(i);
			}
			System.out.println();
		}
		int x = 0;
		int y = 0;
		
		
		
		if(compare(key, lock) == false) {
			int[][] tryKey = new int[key.length][key.length];
			for(int i=0; i<tryKey.length; ++i) {
				for(int j=0; j<tryKey.length; ++j) {
					tryKey[i][j] = 0;
				}	
			}
			
			for(int i=0; i<tryKey.length; ++i) {
				for(int j=0; j<tryKey.length; ++j) {
					tryKey[i][j] = 0;
				}	
			}
			
		}
		
		
		
		

		
		
	}
	
	public static int[][] rotate(int[][] arr){
		int length = arr.length;
		int[][] rotateArr = new int[length][length];
		
		for(int i=0; i<length; ++i) {
			for(int j=0; j<length; ++j) {
				rotateArr[i][j]=arr[length-1-j][i];
			}
		}
		
		return rotateArr;
	}
	
	public static boolean compare(int[][] key, int[][] lock) {
		int[][] compareArr = new int[lock.length][lock.length];
		
		for(int i=0; i<lock.length; ++i) {
			for(int j=0; j<lock.length; ++j) {
				compareArr[i][j] = lock[i][j]+key[i][j];
			}
		}
		
		for(int[] arr : compareArr) {
			for(int i : arr) {
				if(i!=1) {
					return false;
				}
			}
		}
		
		return true;
	}
}
















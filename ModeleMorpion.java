
public class ModeleMorpion {
	
	private char[][] data;
	
	public ModeleMorpion() {
		this.data = new char[3][3];
	}
	public void initialiser() {
		for(int i=0;i<3 ;i++) {
			for(int j=0;j<3 ;j++) {
				this.data[i][j] = ' ';
			}
		}
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<3 ;i++) {
			for(int j=0;j<3 ;j++) {
				sb.append(this.data[i][j]);
			}
		}
		return sb.toString();
	}
	
	public void update(int i, int j, char c ) {
		this.data[i][j]
	}

}



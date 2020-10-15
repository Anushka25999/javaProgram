public class GamblerSimulator{

	//Constants
	private final int TOTAL = 100;
	private final int BET = 1;

	public void stake(){
		int random=(int)Math.floor(Math.random()*10)%2;
		if(random==0){
			System.out.println("You Won");
		}
		else{
			System.out.println("You Lose");
		}
	}
	public static void main(String[] args){
		GamblerSimulator gamble = new GamblerSimulator();
		gamble.stake();
	}
}

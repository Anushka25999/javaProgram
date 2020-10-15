public class GamblerSimulator{

	//Constants
	private final int STAKE = 100;
	private final int BET = 1;
	private static final float STAKE_VALUE = 0.5f;
	public int winningAmount, losingAmount, stake;

	//UC2 WIN OR LOSS
	public void winOrLoss(){
		int random=(int)Math.floor(Math.random()*10)%2;
		if(random==0){
			System.out.println("You Win");
			stake++;
		}
		else{
			System.out.println("You Loss");
			stake--;
		}
	}

	//UC3 Gambler Resigns after 50% win or loss
	public int resignGame(){
		losingAmount = (int)Math.round(STAKE * STAKE_VALUE);
		winningAmount = (int)Math.round(STAKE+(STAKE * STAKE_VALUE));
		boolean stop = true;
		stake = STAKE;
		while(stop == true){
			winOrLoss();
			if(stake == losingAmount){
				stop=false;
			}
			if(stake == winningAmount){
				stop=false;
			}
		}
		return stake;
	}

	public static void main(String[] args){
		GamblerSimulator gamble = new GamblerSimulator();
		gamble.winOrLoss();
		System.out.println(gamble.resignGame());
	}
}

package thirdwork;

public class tiaoyizhangpai {
	public static void main(String[] args) {
        int[]deck=new int[52];
        String[] suits={"Spades","Hearts","Diamonds","Club"};
        String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        for(int i=0;i<deck.length;i++)
           deck[i]=i;
        for(int j=0;j<deck.length;j++){
            int index=(int)(Math.random()*deck.length);
            int temp=deck[j];
            deck[j]=deck[index];
            deck[index]=temp;  
        }
        for(int i=0;i<1;i++){
            String suit=suits[deck[i]/13];
            String rank=ranks[deck[i]%13];
            System.out.println("The card you picked is "+rank+" of "+suit);
        }   
    }
}

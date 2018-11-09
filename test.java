import java.util.*;


public class Test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("How many people:");
        final int n = in.nextInt();
        BullfightGame firstBegin = new BullfightGame(n);
        int[][] cowCard = new int[n][5];
        cowCard= firstBegin.getCards();//游戏开始

        int [] howCow = firstBegin.getCow(cowCard);
        int [] cowTotal = firstBegin.returnTolal();
        int [] cowHaveCow = firstBegin.returnHaveCow();
        int [] cowIsCow= firstBegin.returnIsCow();
        int [] cowIsFourFlowers = firstBegin.returnIsFourFlowers();
        int [] cowIsFiveFlowers = firstBegin.returnIsFiveFlowers();
        Compare firstCompare = new Compare(howCow,cowTotal,cowHaveCow,cowIsCow,cowIsFourFlowers,cowIsFiveFlowers,n);
        int b = firstCompare.theWinner(0);
        System.out.println("玩家"+(b+1)+"胜利");




    }

}

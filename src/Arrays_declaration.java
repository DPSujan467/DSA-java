public class Arrays_declaration {
    public static void main(String[] args) {
        int Ages[] = new int[4];
        Ages[0] = 10;
        Ages[1] = 20;
        Ages[2] = 300;
        Ages[3] = 400;
        System.out.println(Ages[0]);
        System.out.println(Ages[1]);
        System.out.println(Ages[2]);
        System.out.println(Ages[3]);

        int book[]={1,2,3,4};
        for (int i=0;i<4;i++) {
            System.out.println(book[i]);
        }

      int[][]rail=new int[2][3];
      rail[0][1]=100;
      rail[1][0]=50;
        System.out.println(rail[0][2]);
        System.out.println(rail.length);

        int [][]train={{12,10},{44,45},{16,06}};
        for (int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println(train[i][j]);
            }
        }




    }
}
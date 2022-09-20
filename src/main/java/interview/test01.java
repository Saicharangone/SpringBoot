package interview;

public class test01 {


    public static void main(String[] args) {
        String input="abccba";
        char[] inputChar =input.toCharArray();
        int length=inputChar.length;
        char spl;
        int count;
        char lenghtString =Character.valueOf((char) (length+1));

        for(int i=0; i<length-1;i++){


            for(int j=i+1; j<length;j++){
                if(inputChar[i]==(inputChar[j])){
                    inputChar[i]= Character.valueOf((char) j);
                    inputChar[j]=lenghtString;




                    break;

                }

            }
        }
        spl =input.charAt(0);
        count=Integer.valueOf(inputChar[0]);

        for(int i=0;i<inputChar.length;i++){
            if(count>Integer.valueOf(inputChar[i])){
                count =Integer.valueOf(inputChar[i]);
                spl=input.charAt(i);
            }
            System.out.println(Integer.valueOf(inputChar[i]));


        }
        System.out.println(spl);



    }
}



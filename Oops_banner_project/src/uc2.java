public class uc2 {
    public static void main(String[] args){
        //UC2
        String[] O={
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
        String[] P={
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        };
        String[] S={
                "   *****",
                " **",
                "**",
                " **",
                "   ***",
                "      **",
                "        **",
                "       **",
                "  *****"

        };
        for(int i=0;i<9;i++){
            String line=String.join(" ",O[i],O[i],P[i],S[i]);
            System.out.println(line);
            //System.out.println(String.join(" ",O[i],O[i],P[i],S[i]));
        }
    }
}

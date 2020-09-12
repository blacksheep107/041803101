public class main {
    public static void main(String[] args) {
        String file1=readToString.readToString(args[0]);
        String file2=readToString.readToString(args[1]);
        double ans= getCos.getCos(file1,file2);
        writeIntoAnswer.writeIntoAnswer(ans);
    }
}

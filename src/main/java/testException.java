public class testException {
    public static void main(String[] args){
        try{
            throw new EmptyTextException("Empty Text!");
        }catch(EmptyTextException e){
            e.printStackTrace();
        }
    }
}

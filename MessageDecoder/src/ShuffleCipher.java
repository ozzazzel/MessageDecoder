public class ShuffleCipher implements MessageDecoder{
	private int numberOfShuffle;
	  //1-argument constructor which takes the shuffle value
	public ShuffleCipher (int numberOfShuffle){
	this.numberOfShuffle = numberOfShuffle;
	}
	   private String reShuffle(String text){
	        String firstHalf ="", secondHalf="";
	        // splits into two halves by taking alternative chars
	        for(int i=0;i<text.length();i++)
	        {
	        	
	        	if(i%2==0)
	                firstHalf += text.charAt(i);
	            else
	                secondHalf += text.charAt(i);               
	        }   
	        // addition of two halves after splitting them alternatively
	        return firstHalf+secondHalf;
	    }
	   public String decode(String cipherText){
	        String decodedMsg = cipherText;
	        for(int i=0;i<numberOfShuffle;i++)
	           decodedMsg = reShuffle(decodedMsg);
	        return decodedMsg;
	    }
}
public class SubstitutionCipher implements MessageDecoder{
	 // value to shift the chacacters
    private int numberOfShift;   
   
    //argument constructor
    public SubstitutionCipher (int numberOfShift){
        this.numberOfShift = numberOfShift;
	}
    private char shift(char ch, int shiftValue){
        char shiftedChar = ch;       
        if(ch >= 'a' && ch <= 'z')
        	//we rest a unit 'a' and add the number of shifts selected
        	//then divide by 26 and add the remainder to the the first unit 'a'

            shiftedChar = (char) ( 'a' + ( ch - 'a' + shiftValue ) %26 );
        return shiftedChar;
        }
    //decode and return the given cipher text
    public String decode(String cipherText){
      String decodedMsg = "";
        for( int i = 0; i < cipherText.length(); i++){
            char ch = cipherText.charAt(i);
            decodedMsg += shift(ch, -numberOfShift);
        }
        return decodedMsg;
    
    }
}
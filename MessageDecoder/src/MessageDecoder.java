/**
 * This class is interface for substitutionCipher and ShuffleCipher
* SubstitutionCipher will add a given number to shift the value of the current
  letter, example: shifts: 3 for 'a'-according to the vocabulary-'a'+3(letters)='d', or b = e
* ShuffleCipher will split a given text and add them alternatively first half and second half of a text
*/

public interface MessageDecoder {
public String decode(String cipherText);
}
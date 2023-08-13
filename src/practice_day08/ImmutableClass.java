package practice_day08;

// Soru: Immutable bir sınıf nasıl oluşturulur? Bir sınıfın değişmez (immutable) olması için
// nasıl adımlar atılır?

public class ImmutableClass {

    public final class ımmutableExample{

        public final String message; //final kelimesi ile degismezlik ozelligi tanimlaniyor

        public ımmutableExample(String message) { // method ile deger atiyoruz
            this.message = message;
        }
        public String getMessage(){ // get methodu ile atanan degere ulasiyorum.
            return message;
        }
    }

}

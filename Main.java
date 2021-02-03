class Main {
  public static void main(String[] args) {
    int length = Keyboard.getInt(" how long is the football pitch?");
    while (length < 90 || length > 120){
      Screen.display(" this pitch does not meet regulations","length thing");

    }
    
     int width = Keyboard.getInt("how wide is the football pitch?");
     while (width < 45 || width > 90){
       Screen.display(" this football pitch no-longer meets regulations","width thing");
     }
     

    




    
  }
}
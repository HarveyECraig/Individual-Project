class Floor{
  int x = 300, y = 300, h = 50;
  
  Floor(int x, int y, int w, int h){
    this.x = x;
    this.y = y;
    this.h = h;
    
  }
  void display(){
    fill(75);
     rect(x, y, 110, h);
  }
  
}

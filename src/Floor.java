class Floor {
  int x, y, h;

  Floor(int x, int y, int h) {
    this.x = x;
    this.y = y;
    this.h = h;
  }
  void display() {
    fill(75);
    stroke(100);
    rect(x, y, 900, h);
  }
//  int findPos {
  
//}
}
Floor floor;

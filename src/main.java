boolean isPressed;
int permx, permy;
int white, black, red, blue, green, yellow;
void setup() {
  white = 255;
  black = 0;
  red = (#FF0000);
  blue = (#0000FF);
  green = (#008000);
  yellow = (#FFFF00);
  background(white);
  permx = width/2;
  permy = height/2;
  size(900, 800);
  
}
void draw() {
  background(white);
  //rect(0, 500, 900, 300);
  if (isPressed == true) {
    planet(mouseX, mouseY);
  } else {
    planet(permx, permy);
  }
}

void planet(int x, int y) {


  ellipse(x, y, 30, 30);
  fill(green);
  if (mousePressed == true && mouseX < x+50 && mouseX > x-50 && mouseY < y + 50 && mouseY > y -50) {
    isPressed = true;
  } else {
    isPressed = false;
    permx = x;
    permy = y;
  }
 if (x-15 <= 0 || x+15 >= width) {
    fill(red);
  } else {
    fill(green);
  }
  if (y-15 <= 0 || y+15 >= height) {
    fill(red);
  }
}
void floor(int h, int y){
  rect(0, y, 900, h);
}

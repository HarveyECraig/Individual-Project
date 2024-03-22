boolean isPressed;
float permx, permy;
int white, black, red, blue, green, yellow;
float speed = 0;
float gravity = 0.1;
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
  stroke(0);
  //rect(0, 500, 900, 300);
  if (isPressed == true) {
    planet(mouseX, mouseY);
  } else {
    planet(permx, permy);
  }
 
}

void planet(float x, float y) {


  ellipse(x, y, 30, 30);
  fill(green);
   y = y + speed;
  speed = speed + gravity;
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
  if (y > height) {
    speed = speed * -0.95;
    y = height;
  }
}
void floor(int h, int y){
  rect(0, y, 900, h);
}

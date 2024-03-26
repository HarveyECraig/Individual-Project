class Player {
  float x, y; // Position of the player
  float speed; // Vertical speed of the player
  float gravity; // Gravity affecting the player
  float xvel;

  // Constructor
  Player(float x, float y, float gravity) {
    this.x = x;
    this.y = y;
    speed = 0;
    this.gravity = gravity;
    
  }

  // Function to update the position of the player
  void update() {
    y += speed;
    speed += gravity;
    x += xvel;
    xvel = 0;
      if(key == 'd'){
    xvel = 5;
  } else if(key == 'a'){
    xvel = -5;
    key = 0;
 
  println(key);
}
  }

  // Function to display the player
  void display() {
    ellipse(x, y, 30, 30);
    fill(green);
  }
// Need to change isMouseNear & Interact to use WASD instead of mouse
  // Function to check if the mouse is near the player
  boolean isMouseNear() {
    return mouseX < x + 50 && mouseX > x - 50 && mouseY < y + 50 && mouseY > y - 50;
  }

  // Function to handle interactions with the player
  void interact() {
    if (mousePressed && isMouseNear()) {
      speed = 0;
    }
    
  }
//void keyReleased(){
//  key = 0;
//}
  // Function to handle bouncing
  void checkEdges() {
    if (x - 15 <= 0 || x + 15 >= width || y - 15 <= 0 || y + 15 >= height) {
      speed *= -0.8;
    }
    if (y > height) {
      y = height;
      speed *= -0.8;
    }
  }
}

Player player; // Declare an instance of the player class


class Player {
  float x, y; // Position of the player
  float speed; // Vertical speed of the player
  float gravity; // Gravity affecting the player
  float xvel;
  boolean jump = false;


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
    if (key == 'd') {
      xvel = 5;
    } else if (key == 'a') {
      xvel = -5;
    } else if (key == 'w') {
      for (int i = -1; i < 0; i = i+1) {
        speed -= 0.5;
      }
    }

    if (keyPressed == false) {

      xvel = 0;
    }

    System.out.println(speed);
    System.out.println(key);
  }


  // Function to display the player
  void display() {
    fill(green);
    ellipse(x, y, 30, 30);
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

  // Function to handle bouncing
  void checkEdges() {
    if (x - 15 <= 0 || x + 15 >= width || y - 15 <= 0 || y + 15 >= height || y + 15>= floor1.y) {
      speed *= -0.8;
    }
    if (y > height) {
      if (speed > 0) {
        y = height;
        speed *= -0.8;
      } else if (speed < 0) {
        y = height;
        speed -= 10;
      }
    }
  }
  //boolean intersect (Floor f){
  //  float d = dist(x, y, f.x, f.y);
  //  if
  //}
}




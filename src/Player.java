class Player {
  float x, y; // Position of the player
  float speed; // Vertical speed of the player
  float gravity; // Gravity affecting the player
  float xvel;
  boolean isJumping;
  float jumpStrength;


  // Constructor
  Player(float x, float y, float gravity, float jumpStrength) {
    this.x = x;
    this.y = y;
    speed = 0;
    this.gravity = gravity;
    this.jumpStrength = jumpStrength;
  }

  // Function to update the position of the player
  void update() {
    y += speed;
    speed += gravity;
    x += xvel;
    xvel = 0;
  
    if (isJumping){
      speed -= jumpStrength;
      isJumping = false;
    }
    
    if (key == 'd') {
      xvel = 5;
    } else if (key == 'a') {
      xvel = -5;
    } else if (key == 'w' && !isJumping) {     
      isJumping = true;
    }

    if (keyPressed == false) {
      isJumping = false;
      xvel = 0;
    }
//if (speed < 0.4 && speed > -0.4) {
//    speed = 0;
//    y = 800;
//  }
    //System.out.println(xvel);
    System.out.println(key);
  }


  // Function to display the player
  void display() {
    ellipse(x, y, 30, 30);
    fill(green);
  }
  // Function to handle bouncing
  void checkEdges() {
    if (x - 15 <= 0 || x + 15 >= width || y - 15 <= 0 || y + 15 >= height) {
      speed *= -0.8;
    }
    if (y > height) {
      y = height;
    }
    
    System.out.println(speed);
  }
}


Player player; // Declare an instance of the player class

PImage image;
PVector point = new PVector();
void setup() {
  size(500, 500);
  background(255);
  image = loadImage("yazirusi.png");
  image(image, width/2, height/2);
}

void draw() {
  background(255);
  if (keyPressed) {
    switch(key) {
    case 'w':
      if (point.y != 0) {
        point.y -= 1;
      }
      break;
    case 'a':
      if (point.x != 0) {
        point.x -= 1;
      }
      break;
    case 's':
      if (point.y != height) {
        point.y += 1;
      }
      break;
    case 'd':
      if (point.x != width) {
        point.x += 1;
      }
      break;
    }
  }
  image(image,point.x,point.y);
}

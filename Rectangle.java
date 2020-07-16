class Rectangle {

  private int width;
  private int height;

  public void setHeight(int h) {
    height = h;
  }
    
  public void setWidth(int w) {
    width = w;
  }
  public void setDimensions(int w, int h) {
    setWidth(w);
    setHeight(h);
  }
    
  // default constructor for inheritence
  Rectangle() {}

  Rectangle(int w,int h) {
    setDimensions(w, h);
  }
  int area() {
    return width * height;
  }
};
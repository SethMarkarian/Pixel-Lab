/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  /** Method to test the collage method */
  public static void testCollage(){
      Picture flower1 = new Picture("flower1.jpg");
      Picture flower2 = new Picture("flower2.jpg");
      Picture barbara = new Picture("barbaraS.jpg");
      Picture temple = new Picture("temple.jpg");
      temple.explore();
      temple.mirrorTemple();
      temple.copy(flower2,10,0);
      temple.copy(flower1,210,149);
      temple.copy(barbara,30,199);
      temple.explore();
    }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical(){
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorArms(){
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
    }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple(){
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testCopy(){
    Picture temple = new Picture("temple.jpg");
    Picture seagull = new Picture("seagull.jpg");
    temple.explore();
    temple.copy2(seagull, 229, 330, 232, 240);
    temple.explore();
    }
  public static void testMirrorGull(){
      Picture seagull = new Picture("seagull.jpg");
      seagull.explore();
      seagull.mirrorGull();
      seagull.explore();
    }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
  public static void testMirrorHorizontal(){
      Picture stalin = new Picture("stalin.jpg");
      stalin.explore();
      stalin.mirrorHorizontal();
      stalin.explore();
    }
  public static void testMirrorVerticalRightToLeft(){
      Picture stalin = new Picture("stalin.jpg");
      stalin.explore();
      stalin.mirrorVertical();
      stalin.explore();
    }
  public static void testMirrorHorizontalBottomToTop(){
      Picture stalin = new Picture("stalin.jpg");
      stalin.explore();
      stalin.mirrorHorizontalBottomToTop();
      stalin.explore();
    }
  
}
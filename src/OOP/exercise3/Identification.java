package OOP.exercise3;

/**
 * A person identification system in the crime fighting office wants to have
 * faster ways to build a drawing that shows the features of a suspect it's
 * known that the drawings of the faces are divided into three regions:
 * the upper part, the middle part and the lower part.
 * In the middle part, there are elements such as the nose.
 * In the upper part, there are elements such as the hair, forehead, eyes,
 * eyebrows.
 * In the lower part, there are mouth and chin.
 * From each element, in turn, certain established models can be had such as
 * a large and fleshy mouth or small and fleshy mouth.
 */
public class Identification {
    private UpperFace upperFace;
    private MiddleFace middleFace;
    private LowerFace lowerFace;

    public Identification(UpperFace upperFace,
                          MiddleFace middleFace,
                          LowerFace lowerFace) {
        this.upperFace = upperFace;
        this.middleFace = middleFace;
        this.lowerFace = lowerFace;
    }
}

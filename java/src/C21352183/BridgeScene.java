package C21352183;

import ie.tudublin.*;

public class BridgeScene extends Visual {
    MainVisual mv;

    int scl = 30;
    int terrainMax = 50;
    int w = width;
    int h = height;
    int rows = 5000 / scl;
    int cols = 2000 / scl;
    float flying;

    float[][] terrain = new float[cols][rows];

    int numSpheres = 70;
    float[] sphereX = new float[numSpheres];
    float[] sphereY = new float[numSpheres];
    float[] sphereZ = new float[numSpheres];
    float[] sphereReact = new float[numSpheres];

    float halfWidth = width / 2;
    float halfHeight = height / 2;

    float moveSphere;

    float smoothedAmplitude;

    public BridgeScene(MainVisual mv) {
        this.mv = mv;
    }

    public void createSpheres(int numSpheres) {
        for(int i = 0; i < numSpheres; i++)
        {
            sphereX[i] = random(-1000, width + 100);
            sphereY[i] = random(400, 500);
            sphereZ[i] = random(-5000, 1000);
            sphereReact[i] = random(0.1f, 0.5f);   
        }
    }

    public void drawSpheres(float zoff) {
        for(int i = 0; i < numSpheres; i++)
        {
            float z = sphereZ[i] + zoff;
            if(z < 1000)
            {
                pushMatrix();
                noFill();
                strokeWeight(2);
                translate(sphereX[i], sphereY[i], z);
                rotateX(frameCount * 0.01f);
                rotateY(frameCount * 0.01f);
                box(20 + smoothedAmplitude * 200);
                popMatrix();
            }
            else
            {
                sphereZ[i] = random(-2000, 1000);
            }
            
        }
    }

    public void createTerrain(float yoff) {
        for (int y = 0; y < cols; y++) {
            float xoff = 0;
            for (int x = 0; x < rows; x++) {
                terrain[y][x] = map(noise(xoff, yoff), 0, 1, -terrainMax - smoothedAmplitude, terrainMax + smoothedAmplitude);
                xoff += 0.4f;
            }
            yoff += 0.4f;   
        }
    }

    public void drawTerrain() {
        for (int y = 10; y < cols - 1; y++) {
            beginShape(TRIANGLE_STRIP);
            for (int x = 0; x < rows; x++) {
                vertex(x * scl, y * scl, terrain[y][x]);
                vertex(x * scl, (y + 1) * scl, terrain[y + 1][x]);
            }
            endShape();
        }
    }

    

    public void render() {
        background(0);
        stroke(255);
        noFill();

        smoothedAmplitude = mv.getSmoothedAmplitude();

        rotateY(-smoothedAmplitude / 2);
        rotateX(-smoothedAmplitude / 5);


        translate(halfWidth, halfHeight);

        moveSphere += 2;

        float zoff = moveSphere;

        pushMatrix();
        rotateX(frameCount * 0.01f);
        sphere(2000); 
        popMatrix();

        drawSpheres(zoff);

        // Waves
        beginShape();
        flying -= smoothedAmplitude / 2;
        float yoff = flying;

        createTerrain(yoff);
        
        translate(width / 6 + 200, (height / 2) + 15, -400);
        rotateX(PI / 2);
        translate(-width / 2, -height / 2);
        fill(0);
        stroke(236, 221, 14);
        strokeWeight(1);
        drawTerrain();
        endShape();
        
        translate(+0, +0, +200);
        fill(0);
        stroke(236, 221, 14);
        strokeWeight(1);
        drawTerrain();
        endShape();
    }
}
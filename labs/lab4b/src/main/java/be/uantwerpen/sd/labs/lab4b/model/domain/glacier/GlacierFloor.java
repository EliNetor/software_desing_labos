package be.uantwerpen.sd.labs.lab4b.model.domain.glacier;

import be.uantwerpen.sd.labs.lab4b.level.Palette;
import be.uantwerpen.sd.labs.lab4b.model.domain.GroundTile;
import javafx.scene.canvas.GraphicsContext;

public final class GlacierFloor extends GroundTile {
    @Override
    public boolean isSolid() {
        /*
            TODO: Implement the isSolid method.
            TIP: The floor isn't solid.
        */
        return false;
    }

    @Override
    public boolean isSlippery() {
        /*
            TODO: Implement the isSlippery method.
            TIP: The icy floor is slippery.
        */
        return true;
    }

    @Override
    public boolean isTarget() {
        /*
            TODO: Implement the isTarget method.
            TIP: The floor is not a target.
        */
        return false;
    }

    @Override
    public void render(GraphicsContext g, Palette p, int x, int y, int s) {
        g.setFill(p.getFloor());
        g.fillRect(x, y, s, s);
    }
}

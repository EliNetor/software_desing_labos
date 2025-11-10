package be.uantwerpen.sd.labs.lab4b.level;

import be.uantwerpen.sd.labs.lab4b.gen.WorldGenerator;
import be.uantwerpen.sd.labs.lab4b.logic.CoveragePolicy;
import be.uantwerpen.sd.labs.lab4b.logic.MovementStrategy;
import be.uantwerpen.sd.labs.lab4b.model.domain.Box;
import be.uantwerpen.sd.labs.lab4b.model.domain.GroundTile;
import be.uantwerpen.sd.labs.lab4b.model.domain.Player;
/*
TODO: Implement the Abstract Factory Pattern here.
*/
public abstract class LevelKit {

    public String name() {
        return getClass().getSimpleName().replace("Kit", "");
    }

    public interface RendererHints {
        boolean showSelectionOverlay();
    }

    public Palette palette() {
        return PaletteDirector.construct(paletteBuilder());
    }

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract MovementStrategy movement();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract WorldGenerator generator();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract RendererHints hints();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract Level level();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract GroundTile floor();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract GroundTile wall();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract GroundTile target();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract Box box();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract Player player();
    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract CoveragePolicy coverage();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract PaletteBuilder paletteBuilder();

}

package html_editor.listeners;

import html_editor.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter {
    private View view;

    public FrameListener(View view) {
        this.view = view;
    }
                       
    public void windowClosing(WindowEvent windowEvent) {
        view.exit();
    }
}


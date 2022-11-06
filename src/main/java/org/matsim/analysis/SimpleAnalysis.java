package org.matsim.analysis;

import org.matsim.core.events.EventsUtils;

public class SimpleAnalysis {
    public static void main(String[] args) {

        var handler = new SimplePersonEventHandler();
        var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);

        EventsUtils.readEvents(manager, "/Users/harristzelepis/IdeaProjects/matsim-example-project/scenarios/equil/output/output_events.xml.gz");
    }
}

package com.routeyou.util;

/**
 * Created by Anoop M on 9/8/2017.
 */

public class GPXWriterHelper {

    public GPXWriterHelper() {
    }

   /*
   public String createNewRoute(final List<WayPoint> wayPoints, final RouteRecordRequest routeRecordRequest) {
        try {
            GPX gpx = new GPX();

            //GPX creator & version
            gpx.setCreator(routeRecordRequest.creator);
            gpx.setVersion(routeRecordRequest.version);

            //GPX Meta data
            Person person = new Person();
            person.setName(routeRecordRequest.authorId);

            Metadata metadata = new Metadata();
            metadata.setAuthor(person);
            metadata.addExtensionData("refrouteid", routeRecordRequest.routeId);

            //GPX Track
            TrackSegment trackSegment = new TrackSegment();

            for (WayPoint wayPointObject : wayPoints) {
                Waypoint waypoint = new Waypoint(Double.parseDouble(wayPointObject.latitude), Double.parseDouble(wayPointObject.longitude));
                waypoint.setTime(new Date(Long.parseLong(wayPointObject.dateTime)));
                waypoint.setElevation(Double.parseDouble(wayPointObject.elevation));
                trackSegment.addWaypoint(waypoint);
            }

            // Current short date & short time
            Date date = new Date();
            DateFormat shortDateTimeFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
            String shortDate = shortDateTimeFormatter.format(date);

            shortDateTimeFormatter = DateFormat.getTimeInstance(DateFormat.SHORT);
            String shortTime = shortDateTimeFormatter.format(date);

            Track track = new Track();
            track.setName(routeRecordRequest.name + routeRecordRequest.routeId + shortDate + shortTime);
            track.setDescription(routeRecordRequest.description);
            track.addTrackSegment(trackSegment);

            //GPX Track Segment
            gpx.setMetadata(metadata);
            gpx.addTrack(track);


            GPXWriter gPXWriter = new GPXWriter();
            return gPXWriter.writeGPX(gpx);
        } catch (ParserConfigurationException | TransformerException ex) {
            ex.printStackTrace();
        }
        return null;
    }
   */
}

package fr.wave.remotedemo;

import fr.wave.remotedemo.model.EndpointsModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


@Configuration
public class AppConfig {



    public AppConfig() {
        try (final DatagramSocket socket = new DatagramSocket()) {
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            this.host = socket.getLocalAddress().getHostAddress();
        } catch (SocketException | UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public EndpointsModel getEndpointsModel() {
        return EndpointsModel.builder()
                .host(host)
                .port(port)
                .postTarget(postTarget)
                .getCompetitors(getCompetitors)
                .isAlive(isAlive)
                .getCompetitionName(getCompetitionName)
                .contextPath(contextPath)
                .build();
    }


    private final String host;
    @Value("${server.port}")
    private String port;

    @Value("${app.endpoints.post-target}")
    private String postTarget;

    @Value("${app.endpoints.get-competitors}")
    private String getCompetitors;

    @Value("${app.endpoints.is-alive}")
    private String isAlive;

    @Value("${app.endpoints.get-name}")
    private String getCompetitionName;

    @Value("${server.servlet.context-path}")
    private String contextPath;
}

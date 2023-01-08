import io.gatling.app.Gatling;
import io.gatling.core.config.GatlingPropertiesBuilder;

/**
 * 压测启动入口
 *
 * @author tjq
 * @since 2023/1/8
 */
public class Engine {

    public static void main(String[] args) {
        GatlingPropertiesBuilder props = new GatlingPropertiesBuilder()
                .resourcesDirectory(IDEPathHelper.mavenResourcesDirectory.toString())
                .resultsDirectory(IDEPathHelper.resultsDirectory.toString())
                .binariesDirectory(IDEPathHelper.mavenBinariesDirectory.toString());

        Gatling.fromMap(props.build());
    }
}

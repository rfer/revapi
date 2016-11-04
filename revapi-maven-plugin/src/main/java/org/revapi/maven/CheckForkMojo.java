package org.revapi.maven;

import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

/**
 * @author Lukas Krejci
 * @since 0.7.0
 */
@Mojo(name = "check-fork", threadSafe = true,
        requiresDependencyCollection = ResolutionScope.COMPILE_PLUS_RUNTIME)
@Execute(phase = LifecyclePhase.PACKAGE)
public class CheckForkMojo extends CheckMojo {
}

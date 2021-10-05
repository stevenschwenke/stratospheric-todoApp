package de.stevenschwenke.aws.stratospheric.cdk;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;

public class DockerRepositoryAppStack extends Stack {
    public DockerRepositoryAppStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public DockerRepositoryAppStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here
    }
}

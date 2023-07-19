package ScreenBuilderStrategies.Drawers;

public class GallowDrawer implements DrawerInterface {
    private static final String[] Images = {
            """
                    ___________
                    |   \\    |
                    |
                    |
                    |
                    |
                    ~~~~~~~~~~~
                    """,
            """
                    ___________
                    |   \\    |
                    |   ()
                    |
                    |
                    |
                    ~~~~~~~~~~~
                    """,
            """
                    ___________
                    |   \\    |
                    |   ()
                    |   []
                    |
                    |
                    ~~~~~~~~~~~
                    """,
            """
                    ___________
                    |   \\    |
                    |   ()
                    |  /[]
                    |
                    |
                    ~~~~~~~~~~~
                    """,
            """
                    ___________
                    |   \\    |
                    |   ()
                    |  /[]\\
                    |
                    |
                    ~~~~~~~~~~~
                    """,
            """
                    ___________
                    |   \\    |
                    |   ()
                    |  /[]\\
                    |  /
                    |
                    ~~~~~~~~~~~
                    """,
            """
                    ___________
                    |   \\    |
                    |   ()
                    |  /[]\\
                    |  /  \\
                    |
                    ~~~~~~~~~~~
                    """
    };

    public static String getAscii(int errorsCount)
    {
        if (errorsCount > 6) errorsCount = 6;
        return GallowDrawer.Images[errorsCount];
    }
}
package com.falcon.testmod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        // Create configuration object from given configuration file
        Configuration configuration = new Configuration(configFile);

        try
        {
            // Load the configuration file
            configuration.load();

            // Read in properties
        }
        catch (Exception e)
        {
            // Log exception
        }
        finally
        {
            // Save the configuration file
            configuration.save();
        }
    }
}

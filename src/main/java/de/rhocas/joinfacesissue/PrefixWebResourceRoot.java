package de.rhocas.joinfacesissue;

import org.apache.catalina.WebResource;
import org.apache.catalina.webresources.StandardRoot;

import java.io.InputStream;
import java.util.Set;

public class PrefixWebResourceRoot extends StandardRoot {

    private final String prefix;

    public PrefixWebResourceRoot(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public WebResource getResource(String path) {
        return super.getResource(prefix + path);
    }

    @Override
    public WebResource[] getResources(String path) {
        return super.getResources(prefix + path);
    }

    @Override
    public WebResource getClassLoaderResource(String path) {
        return super.getClassLoaderResource(prefix + path);
    }

    @Override
    public WebResource[] getClassLoaderResources(String path) {
        return super.getClassLoaderResources(prefix + path);
    }

    @Override
    public String[] list(String path) {
        return super.list(prefix + path);
    }

    @Override
    public Set<String> listWebAppPaths(String path) {
        return super.listWebAppPaths(prefix + path);
    }

    @Override
    public WebResource[] listResources(String path) {
        return super.listResources(prefix + path);
    }

    @Override
    public boolean mkdir(String path) {
        return super.mkdir(prefix + path);
    }

    @Override
    public boolean write(String path, InputStream is, boolean overwrite) {
        return super.write(prefix + path, is, overwrite);
    }

}

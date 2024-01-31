package br.com.template_method.example.network;

/**
 * Base class of social network.
 */
public abstract class Network
{
    String userName;
    String password;

    Network() {}

    /**
     * Publish the data to whatever network.
     *
     * @param message
     * @return
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }

        return false;
    }

abstract boolean logIn(String userName, String password);
abstract boolean sendData(byte[] bytes);
abstract void logOut ();
}
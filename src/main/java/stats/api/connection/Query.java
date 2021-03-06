/**
 * Package dealing with querying the API
 */
package stats.api.connection;

import org.json.JSONObject;

/**
 * @author nikhilsaraf
 * 
 *         Represents a query with specific headers and fields to an API.
 */
public interface Query {

	JSONObject getResponse();

	String getUrl();

}

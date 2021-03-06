/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-04-27 at 19:00:47 UTC 
 * Modify at your own risk.
 */

package com.example.jt.myapplication.backend.userList;

/**
 * Service definition for UserList (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link UserListRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class UserList extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.20.0 of the userList library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "userList/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public UserList(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  UserList(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "authUser".
   *
   * This request holds the parameters needed by the userList server.  After setting any optional
   * parameters, call the {@link AuthUser#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public AuthUser authUser() throws java.io.IOException {
    AuthUser result = new AuthUser();
    initialize(result);
    return result;
  }

  public class AuthUser extends UserListRequest<com.example.jt.myapplication.backend.userList.model.User> {

    private static final String REST_PATH = "authUser/authed";

    /**
     * Create a request for the method "authUser".
     *
     * This request holds the parameters needed by the the userList server.  After setting any
     * optional parameters, call the {@link AuthUser#execute()} method to invoke the remote operation.
     * <p> {@link
     * AuthUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected AuthUser() {
      super(UserList.this, "POST", REST_PATH, null, com.example.jt.myapplication.backend.userList.model.User.class);
    }

    @Override
    public AuthUser setAlt(java.lang.String alt) {
      return (AuthUser) super.setAlt(alt);
    }

    @Override
    public AuthUser setFields(java.lang.String fields) {
      return (AuthUser) super.setFields(fields);
    }

    @Override
    public AuthUser setKey(java.lang.String key) {
      return (AuthUser) super.setKey(key);
    }

    @Override
    public AuthUser setOauthToken(java.lang.String oauthToken) {
      return (AuthUser) super.setOauthToken(oauthToken);
    }

    @Override
    public AuthUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (AuthUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public AuthUser setQuotaUser(java.lang.String quotaUser) {
      return (AuthUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public AuthUser setUserIp(java.lang.String userIp) {
      return (AuthUser) super.setUserIp(userIp);
    }

    @Override
    public AuthUser set(String parameterName, Object value) {
      return (AuthUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "deleteUser".
   *
   * This request holds the parameters needed by the userList server.  After setting any optional
   * parameters, call the {@link DeleteUser#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public DeleteUser deleteUser(java.lang.Integer id) throws java.io.IOException {
    DeleteUser result = new DeleteUser(id);
    initialize(result);
    return result;
  }

  public class DeleteUser extends UserListRequest<com.example.jt.myapplication.backend.userList.model.User> {

    private static final String REST_PATH = "user/{id}";

    /**
     * Create a request for the method "deleteUser".
     *
     * This request holds the parameters needed by the the userList server.  After setting any
     * optional parameters, call the {@link DeleteUser#execute()} method to invoke the remote
     * operation. <p> {@link
     * DeleteUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected DeleteUser(java.lang.Integer id) {
      super(UserList.this, "DELETE", REST_PATH, null, com.example.jt.myapplication.backend.userList.model.User.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public DeleteUser setAlt(java.lang.String alt) {
      return (DeleteUser) super.setAlt(alt);
    }

    @Override
    public DeleteUser setFields(java.lang.String fields) {
      return (DeleteUser) super.setFields(fields);
    }

    @Override
    public DeleteUser setKey(java.lang.String key) {
      return (DeleteUser) super.setKey(key);
    }

    @Override
    public DeleteUser setOauthToken(java.lang.String oauthToken) {
      return (DeleteUser) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteUser setQuotaUser(java.lang.String quotaUser) {
      return (DeleteUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteUser setUserIp(java.lang.String userIp) {
      return (DeleteUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer id;

    /**

     */
    public java.lang.Integer getId() {
      return id;
    }

    public DeleteUser setId(java.lang.Integer id) {
      this.id = id;
      return this;
    }

    @Override
    public DeleteUser set(String parameterName, Object value) {
      return (DeleteUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getAllUser".
   *
   * This request holds the parameters needed by the userList server.  After setting any optional
   * parameters, call the {@link GetAllUser#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetAllUser getAllUser() throws java.io.IOException {
    GetAllUser result = new GetAllUser();
    initialize(result);
    return result;
  }

  public class GetAllUser extends UserListRequest<com.example.jt.myapplication.backend.userList.model.UserCollection> {

    private static final String REST_PATH = "usercollection";

    /**
     * Create a request for the method "getAllUser".
     *
     * This request holds the parameters needed by the the userList server.  After setting any
     * optional parameters, call the {@link GetAllUser#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetAllUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetAllUser() {
      super(UserList.this, "GET", REST_PATH, null, com.example.jt.myapplication.backend.userList.model.UserCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetAllUser setAlt(java.lang.String alt) {
      return (GetAllUser) super.setAlt(alt);
    }

    @Override
    public GetAllUser setFields(java.lang.String fields) {
      return (GetAllUser) super.setFields(fields);
    }

    @Override
    public GetAllUser setKey(java.lang.String key) {
      return (GetAllUser) super.setKey(key);
    }

    @Override
    public GetAllUser setOauthToken(java.lang.String oauthToken) {
      return (GetAllUser) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAllUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAllUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAllUser setQuotaUser(java.lang.String quotaUser) {
      return (GetAllUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAllUser setUserIp(java.lang.String userIp) {
      return (GetAllUser) super.setUserIp(userIp);
    }

    @Override
    public GetAllUser set(String parameterName, Object value) {
      return (GetAllUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getUser".
   *
   * This request holds the parameters needed by the userList server.  After setting any optional
   * parameters, call the {@link GetUser#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetUser getUser(java.lang.Integer id) throws java.io.IOException {
    GetUser result = new GetUser(id);
    initialize(result);
    return result;
  }

  public class GetUser extends UserListRequest<com.example.jt.myapplication.backend.userList.model.User> {

    private static final String REST_PATH = "user/{id}";

    /**
     * Create a request for the method "getUser".
     *
     * This request holds the parameters needed by the the userList server.  After setting any
     * optional parameters, call the {@link GetUser#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetUser(java.lang.Integer id) {
      super(UserList.this, "GET", REST_PATH, null, com.example.jt.myapplication.backend.userList.model.User.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetUser setAlt(java.lang.String alt) {
      return (GetUser) super.setAlt(alt);
    }

    @Override
    public GetUser setFields(java.lang.String fields) {
      return (GetUser) super.setFields(fields);
    }

    @Override
    public GetUser setKey(java.lang.String key) {
      return (GetUser) super.setKey(key);
    }

    @Override
    public GetUser setOauthToken(java.lang.String oauthToken) {
      return (GetUser) super.setOauthToken(oauthToken);
    }

    @Override
    public GetUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetUser setQuotaUser(java.lang.String quotaUser) {
      return (GetUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetUser setUserIp(java.lang.String userIp) {
      return (GetUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer id;

    /**

     */
    public java.lang.Integer getId() {
      return id;
    }

    public GetUser setId(java.lang.Integer id) {
      this.id = id;
      return this;
    }

    @Override
    public GetUser set(String parameterName, Object value) {
      return (GetUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "newUser".
   *
   * This request holds the parameters needed by the userList server.  After setting any optional
   * parameters, call the {@link NewUser#execute()} method to invoke the remote operation.
   *
   * @param name
   * @return the request
   */
  public NewUser newUser(java.lang.String name) throws java.io.IOException {
    NewUser result = new NewUser(name);
    initialize(result);
    return result;
  }

  public class NewUser extends UserListRequest<com.example.jt.myapplication.backend.userList.model.User> {

    private static final String REST_PATH = "postUser/{name}";

    /**
     * Create a request for the method "newUser".
     *
     * This request holds the parameters needed by the the userList server.  After setting any
     * optional parameters, call the {@link NewUser#execute()} method to invoke the remote operation.
     * <p> {@link
     * NewUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param name
     * @since 1.13
     */
    protected NewUser(java.lang.String name) {
      super(UserList.this, "POST", REST_PATH, null, com.example.jt.myapplication.backend.userList.model.User.class);
      this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
    }

    @Override
    public NewUser setAlt(java.lang.String alt) {
      return (NewUser) super.setAlt(alt);
    }

    @Override
    public NewUser setFields(java.lang.String fields) {
      return (NewUser) super.setFields(fields);
    }

    @Override
    public NewUser setKey(java.lang.String key) {
      return (NewUser) super.setKey(key);
    }

    @Override
    public NewUser setOauthToken(java.lang.String oauthToken) {
      return (NewUser) super.setOauthToken(oauthToken);
    }

    @Override
    public NewUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (NewUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public NewUser setQuotaUser(java.lang.String quotaUser) {
      return (NewUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public NewUser setUserIp(java.lang.String userIp) {
      return (NewUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String name;

    /**

     */
    public java.lang.String getName() {
      return name;
    }

    public NewUser setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    @Override
    public NewUser set(String parameterName, Object value) {
      return (NewUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateUser".
   *
   * This request holds the parameters needed by the userList server.  After setting any optional
   * parameters, call the {@link UpdateUser#execute()} method to invoke the remote operation.
   *
   * @param id
   * @param name
   * @return the request
   */
  public UpdateUser updateUser(java.lang.Integer id, java.lang.String name) throws java.io.IOException {
    UpdateUser result = new UpdateUser(id, name);
    initialize(result);
    return result;
  }

  public class UpdateUser extends UserListRequest<com.example.jt.myapplication.backend.userList.model.User> {

    private static final String REST_PATH = "user/{id}/{name}";

    /**
     * Create a request for the method "updateUser".
     *
     * This request holds the parameters needed by the the userList server.  After setting any
     * optional parameters, call the {@link UpdateUser#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @param name
     * @since 1.13
     */
    protected UpdateUser(java.lang.Integer id, java.lang.String name) {
      super(UserList.this, "PUT", REST_PATH, null, com.example.jt.myapplication.backend.userList.model.User.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
    }

    @Override
    public UpdateUser setAlt(java.lang.String alt) {
      return (UpdateUser) super.setAlt(alt);
    }

    @Override
    public UpdateUser setFields(java.lang.String fields) {
      return (UpdateUser) super.setFields(fields);
    }

    @Override
    public UpdateUser setKey(java.lang.String key) {
      return (UpdateUser) super.setKey(key);
    }

    @Override
    public UpdateUser setOauthToken(java.lang.String oauthToken) {
      return (UpdateUser) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateUser setQuotaUser(java.lang.String quotaUser) {
      return (UpdateUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateUser setUserIp(java.lang.String userIp) {
      return (UpdateUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer id;

    /**

     */
    public java.lang.Integer getId() {
      return id;
    }

    public UpdateUser setId(java.lang.Integer id) {
      this.id = id;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String name;

    /**

     */
    public java.lang.String getName() {
      return name;
    }

    public UpdateUser setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    @Override
    public UpdateUser set(String parameterName, Object value) {
      return (UpdateUser) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link UserList}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link UserList}. */
    @Override
    public UserList build() {
      return new UserList(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link UserListRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setUserListRequestInitializer(
        UserListRequestInitializer userlistRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(userlistRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

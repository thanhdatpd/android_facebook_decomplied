package com.facebook.katana.friendrequests;

import com.facebook.friends.FriendRequestState;
import com.facebook.friends.model.FriendRequest;
import com.facebook.graphql.model.GraphQLProfile;
import com.google.common.util.concurrent.FutureCallback;

class FriendRequestsFragment$14
  implements FutureCallback<Void>
{
  public void a(Throwable paramThrowable)
  {
    FriendRequestsFragment.a(this.b, "Failed to ignore friend suggestion: " + this.a.profile.id, paramThrowable);
  }

  public void a(Void paramVoid)
  {
    FriendRequestsFragment.a(this.b).a(this.a.profile.id, FriendRequestState.IGNORED);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.katana.friendrequests.FriendRequestsFragment.14
 * JD-Core Version:    0.6.0
 */
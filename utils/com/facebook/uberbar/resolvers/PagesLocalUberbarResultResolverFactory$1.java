package com.facebook.uberbar.resolvers;

import android.database.Cursor;
import com.facebook.ipc.data.uberbar.UberbarResult;
import com.facebook.uberbar.UberbarResults;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

final class PagesLocalUberbarResultResolverFactory$1
  implements Function<Cursor, List<UberbarResult>>
{
  public List<UberbarResult> a(Cursor paramCursor)
  {
    ImmutableList.Builder localBuilder = ImmutableList.e();
    int i = paramCursor.getColumnIndex("user_id");
    int j = paramCursor.getColumnIndex("display_name");
    int k = paramCursor.getColumnIndex("user_image_url");
    while (paramCursor.moveToNext())
    {
      long l = paramCursor.getLong(i);
      String str = paramCursor.getString(j);
      localBuilder.b(UberbarResults.a(paramCursor.getString(k), str, l));
    }
    return localBuilder.b();
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.facebook.uberbar.resolvers.PagesLocalUberbarResultResolverFactory.1
 * JD-Core Version:    0.6.2
 */
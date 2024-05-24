// Generated by Dagger (https://dagger.dev).
package com.plcoding.e_book.di;

import com.plcoding.e_book.data.local.BooksDao;
import com.plcoding.e_book.data.local.BooksDatabse;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideBooksDaoFactory implements Factory<BooksDao> {
  private final Provider<BooksDatabse> booksDatabaseProvider;

  public AppModule_ProvideBooksDaoFactory(Provider<BooksDatabse> booksDatabaseProvider) {
    this.booksDatabaseProvider = booksDatabaseProvider;
  }

  @Override
  public BooksDao get() {
    return provideBooksDao(booksDatabaseProvider.get());
  }

  public static AppModule_ProvideBooksDaoFactory create(
      Provider<BooksDatabse> booksDatabaseProvider) {
    return new AppModule_ProvideBooksDaoFactory(booksDatabaseProvider);
  }

  public static BooksDao provideBooksDao(BooksDatabse booksDatabase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBooksDao(booksDatabase));
  }
}
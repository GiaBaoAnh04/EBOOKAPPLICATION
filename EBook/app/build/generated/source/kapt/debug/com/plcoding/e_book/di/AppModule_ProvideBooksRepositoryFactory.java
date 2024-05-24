// Generated by Dagger (https://dagger.dev).
package com.plcoding.e_book.di;

import com.plcoding.e_book.data.local.BooksDao;
import com.plcoding.e_book.data.remote.BooksApi;
import com.plcoding.e_book.domain.repository.BooksResponsitory;
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
public final class AppModule_ProvideBooksRepositoryFactory implements Factory<BooksResponsitory> {
  private final Provider<BooksApi> booksApiProvider;

  private final Provider<BooksDao> booksDaoProvider;

  public AppModule_ProvideBooksRepositoryFactory(Provider<BooksApi> booksApiProvider,
      Provider<BooksDao> booksDaoProvider) {
    this.booksApiProvider = booksApiProvider;
    this.booksDaoProvider = booksDaoProvider;
  }

  @Override
  public BooksResponsitory get() {
    return provideBooksRepository(booksApiProvider.get(), booksDaoProvider.get());
  }

  public static AppModule_ProvideBooksRepositoryFactory create(Provider<BooksApi> booksApiProvider,
      Provider<BooksDao> booksDaoProvider) {
    return new AppModule_ProvideBooksRepositoryFactory(booksApiProvider, booksDaoProvider);
  }

  public static BooksResponsitory provideBooksRepository(BooksApi booksApi, BooksDao booksDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBooksRepository(booksApi, booksDao));
  }
}

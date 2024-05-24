// Generated by Dagger (https://dagger.dev).
package com.plcoding.e_book.di;

import com.plcoding.e_book.data.local.BooksDao;
import com.plcoding.e_book.domain.repository.BooksResponsitory;
import com.plcoding.e_book.domain.usecases.book.BooksUseCase;
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
public final class AppModule_ProvideBooksUseCasesFactory implements Factory<BooksUseCase> {
  private final Provider<BooksResponsitory> booksResponsitoryProvider;

  private final Provider<BooksDao> booksDaoProvider;

  public AppModule_ProvideBooksUseCasesFactory(
      Provider<BooksResponsitory> booksResponsitoryProvider, Provider<BooksDao> booksDaoProvider) {
    this.booksResponsitoryProvider = booksResponsitoryProvider;
    this.booksDaoProvider = booksDaoProvider;
  }

  @Override
  public BooksUseCase get() {
    return provideBooksUseCases(booksResponsitoryProvider.get(), booksDaoProvider.get());
  }

  public static AppModule_ProvideBooksUseCasesFactory create(
      Provider<BooksResponsitory> booksResponsitoryProvider, Provider<BooksDao> booksDaoProvider) {
    return new AppModule_ProvideBooksUseCasesFactory(booksResponsitoryProvider, booksDaoProvider);
  }

  public static BooksUseCase provideBooksUseCases(BooksResponsitory booksResponsitory,
      BooksDao booksDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBooksUseCases(booksResponsitory, booksDao));
  }
}

package com.plcoding.e_book.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001cH\u0007J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001cH\u0007J\u0010\u0010\'\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010(\u001a\u00020)H\u0007J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\fH\u0007J\b\u00100\u001a\u000201H\u0007J\u0010\u00102\u001a\u00020\n2\u0006\u00103\u001a\u000201H\u0007J\b\u00104\u001a\u000205H\u0007\u00a8\u00066"}, d2 = {"Lcom/plcoding/e_book/di/AppModule;", "", "()V", "provideAppEntryUseCases", "Lcom/plcoding/e_book/domain/usecases/app_entry/AppEntryUseCases;", "localUserManager", "Lcom/plcoding/e_book/domain/manager/LocalUserManager;", "provideBooksApi", "Lcom/plcoding/e_book/data/remote/BooksApi;", "retrofit", "Lretrofit2/Retrofit;", "provideBooksDao", "Lcom/plcoding/e_book/data/local/BooksDao;", "booksDatabase", "Lcom/plcoding/e_book/data/local/BooksDatabse;", "provideBooksDatabase", "application", "Landroid/app/Application;", "provideBooksRepository", "Lcom/plcoding/e_book/domain/repository/BooksResponsitory;", "booksApi", "booksDao", "provideBooksUseCases", "Lcom/plcoding/e_book/domain/usecases/book/BooksUseCase;", "booksResponsitory", "provideCategoryApi", "Lcom/plcoding/e_book/data/remote/CategoryApi;", "provideCategoryDao", "Lcom/plcoding/e_book/data/local/CategoryDao;", "categoryDatabase", "Lcom/plcoding/e_book/data/local/CategoryDatabase;", "provideCategoryDatabase", "provideCategoryRepository", "Lcom/plcoding/e_book/domain/repository/CategoryRepository;", "categoryApi", "categoryDao", "provideCategoryUseCases", "Lcom/plcoding/e_book/domain/usecases/category/CategoryUseCase;", "categoryRepository", "provideLocalUserManager", "provideMyBooksApi", "Lcom/plcoding/e_book/data/remote/MyBooksApi;", "provideMyBooksRepository", "Lcom/plcoding/e_book/domain/repository/MyBookRepository;", "myBooksApi", "provideMyBooksUseCases", "Lcom/plcoding/e_book/domain/usecases/mybook/MyBookUseCase;", "myBookRepository", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "okHttpClient", "provideUpdateChapterApi", "Lcom/plcoding/e_book/domain/model/update_reading/UpdateChapterApi;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.plcoding.e_book.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.manager.LocalUserManager provideLocalUserManager(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.app_entry.AppEntryUseCases provideAppEntryUseCases(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.manager.LocalUserManager localUserManager) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.data.remote.BooksApi provideBooksApi(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.repository.BooksResponsitory provideBooksRepository(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.remote.BooksApi booksApi, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.BooksDao booksDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.book.BooksUseCase provideBooksUseCases(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.repository.BooksResponsitory booksResponsitory, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.BooksDao booksDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.data.local.BooksDatabse provideBooksDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.data.local.BooksDao provideBooksDao(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.BooksDatabse booksDatabase) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.data.remote.CategoryApi provideCategoryApi() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.repository.CategoryRepository provideCategoryRepository(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.remote.CategoryApi categoryApi, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.CategoryDao categoryDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.category.CategoryUseCase provideCategoryUseCases(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.repository.CategoryRepository categoryRepository, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.CategoryDao categoryDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.data.local.CategoryDatabase provideCategoryDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.data.local.CategoryDao provideCategoryDao(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.CategoryDatabase categoryDatabase) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.usecases.mybook.MyBookUseCase provideMyBooksUseCases(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.domain.repository.MyBookRepository myBookRepository, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.BooksDao booksDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.data.remote.MyBooksApi provideMyBooksApi() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.repository.MyBookRepository provideMyBooksRepository(@org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.remote.MyBooksApi myBooksApi, @org.jetbrains.annotations.NotNull
    com.plcoding.e_book.data.local.BooksDao booksDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.e_book.domain.model.update_reading.UpdateChapterApi provideUpdateChapterApi() {
        return null;
    }
}
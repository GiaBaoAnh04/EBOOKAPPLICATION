// Generated by Dagger (https://dagger.dev).
package com.plcoding.e_book;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.plcoding.e_book.data.local.BooksDao;
import com.plcoding.e_book.data.local.BooksDatabse;
import com.plcoding.e_book.data.local.CategoryDao;
import com.plcoding.e_book.data.local.CategoryDatabase;
import com.plcoding.e_book.data.remote.BooksApi;
import com.plcoding.e_book.data.remote.CategoryApi;
import com.plcoding.e_book.data.remote.MyBooksApi;
import com.plcoding.e_book.di.AppModule_ProvideAppEntryUseCasesFactory;
import com.plcoding.e_book.di.AppModule_ProvideBooksApiFactory;
import com.plcoding.e_book.di.AppModule_ProvideBooksDaoFactory;
import com.plcoding.e_book.di.AppModule_ProvideBooksDatabaseFactory;
import com.plcoding.e_book.di.AppModule_ProvideBooksRepositoryFactory;
import com.plcoding.e_book.di.AppModule_ProvideBooksUseCasesFactory;
import com.plcoding.e_book.di.AppModule_ProvideCategoryApiFactory;
import com.plcoding.e_book.di.AppModule_ProvideCategoryDaoFactory;
import com.plcoding.e_book.di.AppModule_ProvideCategoryDatabaseFactory;
import com.plcoding.e_book.di.AppModule_ProvideCategoryRepositoryFactory;
import com.plcoding.e_book.di.AppModule_ProvideCategoryUseCasesFactory;
import com.plcoding.e_book.di.AppModule_ProvideLocalUserManagerFactory;
import com.plcoding.e_book.di.AppModule_ProvideMyBooksApiFactory;
import com.plcoding.e_book.di.AppModule_ProvideMyBooksRepositoryFactory;
import com.plcoding.e_book.di.AppModule_ProvideMyBooksUseCasesFactory;
import com.plcoding.e_book.di.AppModule_ProvideOkHttpClientFactory;
import com.plcoding.e_book.di.AppModule_ProvideRetrofitFactory;
import com.plcoding.e_book.di.AppModule_ProvideUpdateChapterApiFactory;
import com.plcoding.e_book.domain.manager.LocalUserManager;
import com.plcoding.e_book.domain.model.update_reading.UpdateChapterApi;
import com.plcoding.e_book.domain.repository.BooksResponsitory;
import com.plcoding.e_book.domain.repository.CategoryRepository;
import com.plcoding.e_book.domain.repository.MyBookRepository;
import com.plcoding.e_book.domain.usecases.app_entry.AppEntryUseCases;
import com.plcoding.e_book.domain.usecases.book.BooksUseCase;
import com.plcoding.e_book.domain.usecases.category.CategoryUseCase;
import com.plcoding.e_book.domain.usecases.mybook.MyBookUseCase;
import com.plcoding.e_book.mainActivity.MainActivity;
import com.plcoding.e_book.mainActivity.MainViewModel;
import com.plcoding.e_book.mainActivity.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.plcoding.e_book.presentation.Search.SearchViewModel;
import com.plcoding.e_book.presentation.Search.SearchViewModel_HiltModules_KeyModule_ProvideFactory;
import com.plcoding.e_book.presentation.book.BookDetailsViewModel;
import com.plcoding.e_book.presentation.book.BookDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.plcoding.e_book.presentation.category.CategoryViewModel;
import com.plcoding.e_book.presentation.category.CategoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookViewModel;
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookViewModel_HiltModules_KeyModule_ProvideFactory;
import com.plcoding.e_book.presentation.home.HomeViewModel;
import com.plcoding.e_book.presentation.home.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.plcoding.e_book.presentation.mybook.MyBookViewModel;
import com.plcoding.e_book.presentation.mybook.MyBookViewModel_HiltModules_KeyModule_ProvideFactory;
import com.plcoding.e_book.presentation.onboarding.OnBoardingViewModel;
import com.plcoding.e_book.presentation.onboarding.OnBoardingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.plcoding.e_book.presentation.payment.paymentViewModel;
import com.plcoding.e_book.presentation.payment.paymentViewModel_HiltModules_KeyModule_ProvideFactory;
import com.plcoding.e_book.presentation.reading_chapter.ReadingViewModel;
import com.plcoding.e_book.presentation.reading_chapter.ReadingViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerNewEBookApplication_HiltComponents_SingletonC {
  private DaggerNewEBookApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public NewEBookApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements NewEBookApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public NewEBookApplication_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements NewEBookApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public NewEBookApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements NewEBookApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public NewEBookApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements NewEBookApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public NewEBookApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements NewEBookApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public NewEBookApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements NewEBookApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public NewEBookApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements NewEBookApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public NewEBookApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends NewEBookApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends NewEBookApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends NewEBookApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends NewEBookApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(10).add(BookDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(CategoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(FavouriteBookViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MyBookViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(OnBoardingViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ReadingViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SearchViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(paymentViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends NewEBookApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<BookDetailsViewModel> bookDetailsViewModelProvider;

    private Provider<CategoryViewModel> categoryViewModelProvider;

    private Provider<FavouriteBookViewModel> favouriteBookViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private Provider<MyBookViewModel> myBookViewModelProvider;

    private Provider<OnBoardingViewModel> onBoardingViewModelProvider;

    private Provider<ReadingViewModel> readingViewModelProvider;

    private Provider<SearchViewModel> searchViewModelProvider;

    private Provider<paymentViewModel> paymentViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.bookDetailsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.categoryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.favouriteBookViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.mainViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.myBookViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.onBoardingViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.readingViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
      this.searchViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 8);
      this.paymentViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 9);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(10).put("com.plcoding.e_book.presentation.book.BookDetailsViewModel", ((Provider) bookDetailsViewModelProvider)).put("com.plcoding.e_book.presentation.category.CategoryViewModel", ((Provider) categoryViewModelProvider)).put("com.plcoding.e_book.presentation.favourite_book.FavouriteBookViewModel", ((Provider) favouriteBookViewModelProvider)).put("com.plcoding.e_book.presentation.home.HomeViewModel", ((Provider) homeViewModelProvider)).put("com.plcoding.e_book.mainActivity.MainViewModel", ((Provider) mainViewModelProvider)).put("com.plcoding.e_book.presentation.mybook.MyBookViewModel", ((Provider) myBookViewModelProvider)).put("com.plcoding.e_book.presentation.onboarding.OnBoardingViewModel", ((Provider) onBoardingViewModelProvider)).put("com.plcoding.e_book.presentation.reading_chapter.ReadingViewModel", ((Provider) readingViewModelProvider)).put("com.plcoding.e_book.presentation.Search.SearchViewModel", ((Provider) searchViewModelProvider)).put("com.plcoding.e_book.presentation.payment.paymentViewModel", ((Provider) paymentViewModelProvider)).build();
    }

    @Override
    public Map<String, Object> getHiltViewModelAssistedMap() {
      return Collections.<String, Object>emptyMap();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.plcoding.e_book.presentation.book.BookDetailsViewModel 
          return (T) new BookDetailsViewModel(singletonCImpl.provideBooksUseCasesProvider.get());

          case 1: // com.plcoding.e_book.presentation.category.CategoryViewModel 
          return (T) new CategoryViewModel(singletonCImpl.provideBooksUseCasesProvider.get(), singletonCImpl.provideCategoryUseCasesProvider.get());

          case 2: // com.plcoding.e_book.presentation.favourite_book.FavouriteBookViewModel 
          return (T) new FavouriteBookViewModel(singletonCImpl.provideBooksUseCasesProvider.get());

          case 3: // com.plcoding.e_book.presentation.home.HomeViewModel 
          return (T) new HomeViewModel(singletonCImpl.provideBooksUseCasesProvider.get(), singletonCImpl.provideCategoryUseCasesProvider.get());

          case 4: // com.plcoding.e_book.mainActivity.MainViewModel 
          return (T) new MainViewModel(singletonCImpl.provideAppEntryUseCasesProvider.get());

          case 5: // com.plcoding.e_book.presentation.mybook.MyBookViewModel 
          return (T) new MyBookViewModel(singletonCImpl.provideMyBooksUseCasesProvider.get());

          case 6: // com.plcoding.e_book.presentation.onboarding.OnBoardingViewModel 
          return (T) new OnBoardingViewModel(singletonCImpl.provideAppEntryUseCasesProvider.get());

          case 7: // com.plcoding.e_book.presentation.reading_chapter.ReadingViewModel 
          return (T) new ReadingViewModel(singletonCImpl.provideUpdateChapterApiProvider.get());

          case 8: // com.plcoding.e_book.presentation.Search.SearchViewModel 
          return (T) new SearchViewModel(singletonCImpl.provideBooksUseCasesProvider.get());

          case 9: // com.plcoding.e_book.presentation.payment.paymentViewModel 
          return (T) new paymentViewModel(singletonCImpl.provideBooksUseCasesProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends NewEBookApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends NewEBookApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends NewEBookApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<OkHttpClient> provideOkHttpClientProvider;

    private Provider<Retrofit> provideRetrofitProvider;

    private Provider<BooksApi> provideBooksApiProvider;

    private Provider<BooksDatabse> provideBooksDatabaseProvider;

    private Provider<BooksDao> provideBooksDaoProvider;

    private Provider<BooksResponsitory> provideBooksRepositoryProvider;

    private Provider<BooksUseCase> provideBooksUseCasesProvider;

    private Provider<CategoryApi> provideCategoryApiProvider;

    private Provider<CategoryDatabase> provideCategoryDatabaseProvider;

    private Provider<CategoryDao> provideCategoryDaoProvider;

    private Provider<CategoryRepository> provideCategoryRepositoryProvider;

    private Provider<CategoryUseCase> provideCategoryUseCasesProvider;

    private Provider<LocalUserManager> provideLocalUserManagerProvider;

    private Provider<AppEntryUseCases> provideAppEntryUseCasesProvider;

    private Provider<MyBooksApi> provideMyBooksApiProvider;

    private Provider<MyBookRepository> provideMyBooksRepositoryProvider;

    private Provider<MyBookUseCase> provideMyBooksUseCasesProvider;

    private Provider<UpdateChapterApi> provideUpdateChapterApiProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 4));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 3));
      this.provideBooksApiProvider = DoubleCheck.provider(new SwitchingProvider<BooksApi>(singletonCImpl, 2));
      this.provideBooksDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<BooksDatabse>(singletonCImpl, 6));
      this.provideBooksDaoProvider = DoubleCheck.provider(new SwitchingProvider<BooksDao>(singletonCImpl, 5));
      this.provideBooksRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<BooksResponsitory>(singletonCImpl, 1));
      this.provideBooksUseCasesProvider = DoubleCheck.provider(new SwitchingProvider<BooksUseCase>(singletonCImpl, 0));
      this.provideCategoryApiProvider = DoubleCheck.provider(new SwitchingProvider<CategoryApi>(singletonCImpl, 9));
      this.provideCategoryDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<CategoryDatabase>(singletonCImpl, 11));
      this.provideCategoryDaoProvider = DoubleCheck.provider(new SwitchingProvider<CategoryDao>(singletonCImpl, 10));
      this.provideCategoryRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<CategoryRepository>(singletonCImpl, 8));
      this.provideCategoryUseCasesProvider = DoubleCheck.provider(new SwitchingProvider<CategoryUseCase>(singletonCImpl, 7));
      this.provideLocalUserManagerProvider = DoubleCheck.provider(new SwitchingProvider<LocalUserManager>(singletonCImpl, 13));
      this.provideAppEntryUseCasesProvider = DoubleCheck.provider(new SwitchingProvider<AppEntryUseCases>(singletonCImpl, 12));
      this.provideMyBooksApiProvider = DoubleCheck.provider(new SwitchingProvider<MyBooksApi>(singletonCImpl, 16));
      this.provideMyBooksRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<MyBookRepository>(singletonCImpl, 15));
      this.provideMyBooksUseCasesProvider = DoubleCheck.provider(new SwitchingProvider<MyBookUseCase>(singletonCImpl, 14));
      this.provideUpdateChapterApiProvider = DoubleCheck.provider(new SwitchingProvider<UpdateChapterApi>(singletonCImpl, 17));
    }

    @Override
    public void injectNewEBookApplication(NewEBookApplication newEBookApplication) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.plcoding.e_book.domain.usecases.book.BooksUseCase 
          return (T) AppModule_ProvideBooksUseCasesFactory.provideBooksUseCases(singletonCImpl.provideBooksRepositoryProvider.get(), singletonCImpl.provideBooksDaoProvider.get());

          case 1: // com.plcoding.e_book.domain.repository.BooksResponsitory 
          return (T) AppModule_ProvideBooksRepositoryFactory.provideBooksRepository(singletonCImpl.provideBooksApiProvider.get(), singletonCImpl.provideBooksDaoProvider.get());

          case 2: // com.plcoding.e_book.data.remote.BooksApi 
          return (T) AppModule_ProvideBooksApiFactory.provideBooksApi(singletonCImpl.provideRetrofitProvider.get());

          case 3: // retrofit2.Retrofit 
          return (T) AppModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.provideOkHttpClientProvider.get());

          case 4: // okhttp3.OkHttpClient 
          return (T) AppModule_ProvideOkHttpClientFactory.provideOkHttpClient();

          case 5: // com.plcoding.e_book.data.local.BooksDao 
          return (T) AppModule_ProvideBooksDaoFactory.provideBooksDao(singletonCImpl.provideBooksDatabaseProvider.get());

          case 6: // com.plcoding.e_book.data.local.BooksDatabse 
          return (T) AppModule_ProvideBooksDatabaseFactory.provideBooksDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule));

          case 7: // com.plcoding.e_book.domain.usecases.category.CategoryUseCase 
          return (T) AppModule_ProvideCategoryUseCasesFactory.provideCategoryUseCases(singletonCImpl.provideCategoryRepositoryProvider.get(), singletonCImpl.provideCategoryDaoProvider.get());

          case 8: // com.plcoding.e_book.domain.repository.CategoryRepository 
          return (T) AppModule_ProvideCategoryRepositoryFactory.provideCategoryRepository(singletonCImpl.provideCategoryApiProvider.get(), singletonCImpl.provideCategoryDaoProvider.get());

          case 9: // com.plcoding.e_book.data.remote.CategoryApi 
          return (T) AppModule_ProvideCategoryApiFactory.provideCategoryApi();

          case 10: // com.plcoding.e_book.data.local.CategoryDao 
          return (T) AppModule_ProvideCategoryDaoFactory.provideCategoryDao(singletonCImpl.provideCategoryDatabaseProvider.get());

          case 11: // com.plcoding.e_book.data.local.CategoryDatabase 
          return (T) AppModule_ProvideCategoryDatabaseFactory.provideCategoryDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule));

          case 12: // com.plcoding.e_book.domain.usecases.app_entry.AppEntryUseCases 
          return (T) AppModule_ProvideAppEntryUseCasesFactory.provideAppEntryUseCases(singletonCImpl.provideLocalUserManagerProvider.get());

          case 13: // com.plcoding.e_book.domain.manager.LocalUserManager 
          return (T) AppModule_ProvideLocalUserManagerFactory.provideLocalUserManager(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule));

          case 14: // com.plcoding.e_book.domain.usecases.mybook.MyBookUseCase 
          return (T) AppModule_ProvideMyBooksUseCasesFactory.provideMyBooksUseCases(singletonCImpl.provideMyBooksRepositoryProvider.get(), singletonCImpl.provideBooksDaoProvider.get());

          case 15: // com.plcoding.e_book.domain.repository.MyBookRepository 
          return (T) AppModule_ProvideMyBooksRepositoryFactory.provideMyBooksRepository(singletonCImpl.provideMyBooksApiProvider.get(), singletonCImpl.provideBooksDaoProvider.get());

          case 16: // com.plcoding.e_book.data.remote.MyBooksApi 
          return (T) AppModule_ProvideMyBooksApiFactory.provideMyBooksApi();

          case 17: // com.plcoding.e_book.domain.model.update_reading.UpdateChapterApi 
          return (T) AppModule_ProvideUpdateChapterApiFactory.provideUpdateChapterApi();

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
